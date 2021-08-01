var e = function(selector) {
    return document.querySelector(selector)
}

var bindEvent = function(element, event, callBack) {
    element.addEventListener(event, callBack) 
}

var getTime = function() {
    var d = new Date()

    var year = d.getFullYear()
    var month = d.getMonth()+1
    var day = d.getDate()

    var xs = d.getHours()
    var fz = d.getMinutes()
    var ms = d.getSeconds()
    if (xs < 10) {
        xs = '0' + xs
    }
    if (fz < 10) {
        fz = '0' + fz
    }
    if (ms < 10) {
        ms = '0' + ms
    }
    return `${year}-${month}-${day} ${xs}:${fz}:${ms}`
}

// find函数可以查找 element 的所有子元素
var find = function(element, selector) {
    return element.querySelector(selector)
}