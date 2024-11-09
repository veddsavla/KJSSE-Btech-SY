document.getElementById('signUp').addEventListener('click', function () {
    document.querySelector('.container').classList.add('right-panel-active');
});

document.getElementById('signInBtn').addEventListener('click', function () {
    document.querySelector('.container').classList.remove('right-panel-active');
});

function validateRegistration() {
    var name = document.getElementById("name").value;
    var password = document.getElementById("password").value;
    var email = document.getElementById("email").value;
    var phone = document.getElementById("phone").value;

    var namePattern = /^[a-zA-Z]{6,}$/;
    var passwordPattern = /^.{6,}$/;
    var emailPattern = /^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$/;
    var phonePattern = /^\d{10}$/;

    if (!namePattern.test(name)) {
        alert("Invalid name! Name should contain alphabets and length should be at least 6 characters.");
        return false;
    }

    if (!passwordPattern.test(password)) {
        alert("Invalid password! Password should be at least 6 characters long.");
        return false;
    }

    if (!emailPattern.test(email)) {
        alert("Invalid email address! Please enter a valid email address.");
        return false;
    }

    if (!phonePattern.test(phone)) {
        alert("Invalid phone number! Phone number should contain exactly 10 digits.");
        return false;
    }

    return true;
}
