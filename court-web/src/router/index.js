import Vue from 'vue'
import Router from 'vue-router'
import Login from '@/components/Login'
import Main from '@/components/Main'
import About from '@/components/About'
import Court from '@/components/Court'
import Consultation from '@/components/Consultation'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Login',
      component: Login
    },
    {
      path: '/main',
      name: 'Main',
      component: Main,
      children: [
        {
          path: 'about',
          name: 'About',
          component: About
        },
        {
          path: 'court',
          name: 'Court',
          component: Court
        },
        {
          path: 'consultation',
          name: 'Consultation',
          component: Consultation
        }
      ]
    }
  ]
})
