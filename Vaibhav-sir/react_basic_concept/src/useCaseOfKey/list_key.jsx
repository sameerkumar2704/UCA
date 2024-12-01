import { useRef, useState } from "react"

export default function ListKey() {
    let arr = useRef( Array(1000).fill(-1))
    const [userName , setUserNames] = useState(arr.current)

    const changeNameToAjay = ( index , changeToName)=>{
      
        
        setUserNames([...arr.current])
        
    }
   console.log(userName)
    return (
        <>
            <h1>using without key props</h1>
            {
                userName.map((name , index) => <p key={index}>{name}</p>)
            }
            
            <button onClick={()=>changeNameToAjay( 0  , "Mayank" )}>Change Name to Mayank at index 0 </button>
        </>


    )
}
