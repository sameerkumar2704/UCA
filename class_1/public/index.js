
 // var support hosting -- imp
function init(){
    let product_list  = []
    function loadData(){
        product_list = data
        render()
    }
    setTimeout(loadData , 2000);
    function render(){
        const product_div = document.getElementById('product-menu')
        const table = product_div.getElementsByTagName('tbody')[0]
        product_list.forEach((curr , index)=>{
            const tr = document.createElement('tr')
            const srNo = document.createElement('td')
            const prodcutName = document.createElement('td')
            const price = document.createElement('td')

            srNo.innerHTML = index+1
            prodcutName.innerHTML =curr.productName
            price.innerHTML =curr.cost

            tr.appendChild(srNo)
            tr.appendChild(prodcutName)
            tr.appendChild(price)
            table.appendChild(tr)

        })
    }


}

init()
