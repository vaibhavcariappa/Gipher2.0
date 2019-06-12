import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Location } from '@angular/common';

export const USER_NAME = "username";
export const TOKEN_NAME = "jwt_token";

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  private hostname: string;
  private SpringRegisterEndPoint: string;
  private SpringSaveEndPoint: string;
  private SpringLoginEndPoint: string;
  

  constructor(private httpclient: HttpClient) { 

      this.hostname = location.host;
      console.log("Location.host:", this.hostname);

      if (this.hostname.indexOf(':') > 0) {
        this.hostname = this.hostname.substr(0, this.hostname.indexOf(':'));
      }
      console.log("hostname:", this.hostname);      
      this.SpringRegisterEndPoint="http://" + this.hostname + ":9087/giphermanager/api/v1/giphermanager/register"
      this.SpringLoginEndPoint="http://" + this.hostname + ":9087/accountmanager/api/v1/accountmanager/login";
      console.log("SpringRegisterEndPoint:", this.SpringRegisterEndPoint); 
      console.log("SpringLoginEndPoint:", this.SpringLoginEndPoint);       
  }

  registerUser(newUser) {
    const url = this.SpringRegisterEndPoint;
    return this.httpclient.post(url, newUser, {observe: "response"});
  }

  // saveUser(newUser) {
  //   const url = this.SpringSaveEndPoint + "save";
  //   return this.httpclient.post(url, newUser);
  // }

  loginUser(newUser) {
    const url = this.SpringLoginEndPoint;
    sessionStorage.setItem(USER_NAME, newUser.username);
    return this.httpclient.post(url, newUser, {observe: "response"});
  }

  getToken() {
    return localStorage.getItem(TOKEN_NAME);
  }

  isTokenActive(token?: string): boolean {
    if(localStorage.getItem(TOKEN_NAME)) {
      console.log("Inside isTokenActive! Returning true")
      return true;
    } else {
      console.log("Inside isTokenActive! Returning false")
      return false;
    }
  }

  logout() {
    sessionStorage.removeItem(USER_NAME);
    sessionStorage.clear();
    localStorage.removeItem(TOKEN_NAME);
    sessionStorage.clear();
    console.log("Logged out!")
  }


}
