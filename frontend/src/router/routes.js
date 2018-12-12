import HomeComponent from "../components/home/HomeComponent";
import LoginComponent from "../components/auth/LoginComponent";
import LogoutComponent from "../components/auth/LogoutComponent";

export const routes = [{
  path: '/',
  name: 'Home',
  component: HomeComponent,
  meta: {
    requiresAuth: false
  }
},
  {
    path: '/login',
    name: 'Login',
    component: LoginComponent,
    meta: {
      requiresAuth: false
    }
  },
  {
    path: '/logout',
    name: "Logout",
    component: LogoutComponent,
    meta: {
      requiresAuth: true
    }
  }
];