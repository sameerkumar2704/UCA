function promisImplemtation( showError){
    setTimeout(()=>{
        if(showError){
            this.error("Error 😔");
        }else{
            this.response({name:'apple' , price:'rs.120' , quantity:'10'})
        }

    },1000)
 return {
    then : (handler)=>{
        this.response = handler;
        return {
            catch : (handler)=>{
                 this.error = handler
            }
        }
    },
    catch:(handler)=>{
        this.error = handler;
        return {
            then : (handler)=>{
               this.response = handler
            }
        }
    }


 }
}

const promise = new promisImplemtation(true).then((res)=>console.log(res)).catch((err)=>console.log(err))
const using_catch_first = new promisImplemtation(false).catch((err)=>console.log(err)).then((res)=>console.log(res))
console.log("other process is running async")
console.log(promise.constructor.name)
