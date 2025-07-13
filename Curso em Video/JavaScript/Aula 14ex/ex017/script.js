function gerar() {
    let num = document.getElementById('txtn')
    let tab = document.getElementById('selTab')

    if (num.value.length == 0){
        window.alert('Insira um numero válido!')

    } else {
        let n = Number(num.value)
        if (n == 0) {
            window.alert('Insira um número maior que 0')

        } else {
            tab.innerHTML = ''
            for(let i = 0; i <= 10; i++) {
                let item = document.createElement('option')
                let res = n * i
                item.text = `${n} x ${i} = ${res}`
                tab.appendChild(item)

            }
        }
    }
}