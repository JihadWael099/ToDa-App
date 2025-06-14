import { UserProfileComponent } from './component/user-profile/user-profile.component';

import { Routes } from '@angular/router';
import { LoginComponent } from './component/login/login.component';
import { RegisterComponent } from './component/register/register.component';
import { NotFoundComponent } from './component/not-found/not-found.component';
import { OtpComponent } from './component/otp/otp.component';
import { HomeComponent } from './component/home/home.component';
import { TaskDetailsComponent } from './component/task-details/task-details.component';
export const routes: Routes = [
      {
        path: 'login',
        component: LoginComponent,
        title: 'Login'
      },
      {
        path: 'verify-otp',
        component: OtpComponent,
        title: 'Verify OTP'
      },
    
      {
        path: 'home',
        component: HomeComponent,
        title: 'Home'
      },
       {
        path: 'profile',
        component: UserProfileComponent,
        title: 'Profile'
      },
    
       
      {
        path: 'register',
        component: RegisterComponent,
        title: 'Register'
      },
      {
        path: 'not-found',
        component: NotFoundComponent
      },
      {
        path: '**',
        redirectTo: 'not-found'
      }
];
