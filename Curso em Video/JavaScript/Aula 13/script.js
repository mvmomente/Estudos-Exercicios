function carregar() {
    var msg = window.document.getElementById('msg')
    var msghr = window.document.getElementById('msghr')
    var img = window.document.getElementById('imagem')
    var data = new Date()
    var hora = data.getHours()
    msg.innerHTML = `Agora são ${hora} horas.`
    
    if (hora >= 6 && hora < 12) {
        //BOM DIA!
        msghr.innerHTML = `Bom Dia!`
        img.src = 'img/manha.png'
        document.body.style.background = '#fbf7eb'
        document.querySelector('header').style.color = '#000000'
        document.querySelector('footer').style.color = '#000000'
    } else if (hora >= 12 && hora < 18) {
        //BOA TARDE!
        msghr.innerHTML = `Boa Tarde!`
        img.src = 'img/tarde.png'
        document.body.style.background = '#8d695c'
    } else if (hora >= 18 && hora <= 23) {
        //BOA NOITE!
        msghr.innerHTML = `Boa Noite!`
        img.src = 'img/noite.png'
        document.body.style.background = '#4c3652'
    } else {
        //BOA MADRUGADA!
        msghr.innerHTML = `Boa Madrugada!`
        img.src = 'img/noite.png'
        document.body.style.background = '#4c3652'

    }
}