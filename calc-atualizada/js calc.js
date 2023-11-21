function calculaadd() {
    let x = parseInt(document.getElementById("x").value);
    let y = parseInt(document.getElementById("y").value);
    let z = x + y;
    document.getElementById("resultado").value = z;
}
function calculasub() {
    let x = parseInt(document.getElementById("x").value);
    let y = parseInt(document.getElementById("y").value);
    let z = x - y;
    document.getElementById("resultado").value = z;
}
function calculamulti() {
    let x = parseInt(document.getElementById("x").value);
    let y = parseInt(document.getElementById("y").value);
    let z = x * y;
    document.getElementById("resultado").value = z;
}
function calculadiv() {
    let x = parseInt(document.getElementById("x").value);
    let y = parseInt(document.getElementById("y").value);
    let h = x / y;
    document.getElementById("resultado").value = h;
}