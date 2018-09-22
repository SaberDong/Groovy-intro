package groovy

//可选形参一：
//1. 可选形参必须位于形参列表的末尾；
//2. 可选形参必须在形参列表中赋值。
def log(x, base=10) {
	Math.log(x) / Math.log(base)
}

println log(1024)
println log(1024, 10)
println log(1024, 2)

//可选形参二：
//Groovy还会把末尾的数组形参视作可选的

def task(name, String[] details) {
	println "$name - $details"
}

task 'Call', '123-456-7890'
task 'Call', '123-456-7890', '231-546-0987'
task 'Check Mail'