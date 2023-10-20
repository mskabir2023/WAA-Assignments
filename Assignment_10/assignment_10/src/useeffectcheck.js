import React, { useEffect, useState } from "react"

export default function Useeffectcheck(){
    const [count,setCount]=useState(0);
    
    useEffect(()=>{
       const cleattime= setTimeout(()=>{
            setCount(count +1);
        },3000);
        return () =>clearInterval(cleattime);

        
    },[count])//didupdate
    return(
        <div>

            <h1>This page is rendered {count} times!!</h1>
            

        </div>
    )
}