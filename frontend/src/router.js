import Vue from 'vue';
import Router from 'vue-router';
import HomeComponent from './components/home/HomeComponent.vue';
import LoginComponent from './components/auth/LoginComponent.vue';
import LogoutComponent from './components/auth/LogoutComponent.vue';

Vue.use(Router);

export default new Router({
    routes: [{
            path: '/',
            name: 'Home',
            component: HomeComponent
        },
        {
            path: '/login',
            name: 'Login',
            component: LoginComponent
        },
        {
            path: '/logout',
            name: "Logout",
            component: LogoutComponent
        }
    ]
});