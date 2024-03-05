window.addEventListener('scroll', e => {
  document.body.style.cssText = `--scrollTop: ${this.scrollY}px`
})

m_Name=new Array("января", "февраля", "марта", "апреля", "мая", "июня", 
"июля", "августа", "сентября", "октября", "ноября", "декабря");
d_Name=new Array("воскресенье", "понедельник", "вторник",
"среда", "четверг", "пятница", "суббота");
function showTime() {
var Now = new Date();
var str="Дата: ";
str+= Now.getDate()+" "+ m_Name[Now.getMonth()]+" " +
Now.getFullYear()+" "+"г. " + "<br>";
str+= d_Name[Now.getDay()] +"<br>";
str+="Время: "+ Now.getHours() + ":" + Now.getMinutes() + ":" + 
Now.getSeconds()+"<br>";
document.getElementById("getTime").innerHTML = str; }

window.addEventListener('load', showTime)

setInterval(showTime, 1000);