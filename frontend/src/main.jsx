import React from 'react'
import ReactDOM from 'react-dom/client'
import { RouterProvider } from 'react-router-dom'
import router from './router/Router.jsx'
import './index.css'
import { RecoilRoot } from 'recoil';

ReactDOM.createRoot(document.getElementById("root")).render(
  <RecoilRoot>
    <React.StrictMode>
      <RouterProvider router={router} 
      fallbackElement={"로딩중입니다."}/>
    </React.StrictMode>
  </RecoilRoot>
);
