import { useEffect, useState } from "react";
import "./App.css";

function App() {
  useEffect(() => {
    async function getData() {
      const res = await fetch("http://localhost:3000/data", {
        headers: { "Content-Type": "application/json" },
        method: "POST",
        body: JSON.stringify({ content: "hello user" }),
      });
    }
    getData();
  });
  return (
    <>
      <p>{name}</p>
    </>
  );
}

export default App;
