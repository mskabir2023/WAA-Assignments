import logo from './logo.svg';
import React from "react";
import './App.css';
import { useState } from 'react';



function App() {
  const [state , setState]=useState(0)
  
  const countincrease=()=>{
    setState(state+1);
  }

  const countdecrease=()=>{
    setState(state-1);
  }

  return (
    <div className="App">

     <p>The OutPut  is =  {state}</p> 

      <button onClick={countincrease}>Count++</button>
      <br />

      <button onClick={countdecrease}>Count--</button>
      
    </div>
  );
}

export default App;
