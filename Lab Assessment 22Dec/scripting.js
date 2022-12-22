// This is for if the user switched between different websites
let doctitle = document.title;
window.addEventListener("blur",()=>{
    document.title = "You filled up all details?";
})
window.addEventListener("focus",()=>{
    document.title = doctitle;
})