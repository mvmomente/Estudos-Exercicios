var agora = new Date()
var hora = agora.getHours()
var minuto = agora.getMinutes()
var segundos = agora.getSeconds()
console.log(`Agora são exatamente ${hora}:${minuto}:${segundos} horas.`)
if (hora >= 0 && hora <= 6) {
    console.log('Boa Madrugada!')
} else if (hora < 12) {
    console.log('Bom Dia!')
} else if (hora <= 18) {
    console.log('Boa Tarde!')
} else {
    console.log('Boa Noite!')
}