import React, { useState } from "react";
import './App.css';
import Useeffectcheck from "./useeffectcheck"

function App() {
  const [active,setActive]=useState(true);

return(
  <div>
    {active && <Useeffectcheck />}

    <button onClick={()=>setActive(false)}>Clear</button>
  
  </div>
)
}

export default App;
