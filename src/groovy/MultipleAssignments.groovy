package groovy

//1. 使用多赋值
def splitName(fullName) {fullName.split(' ')}

def (firstName, lastName) = splitName('James Bond')
println "$lastName, $firstName $lastName"

//2.交换变量
def name1 = "Saber"
def name2 = "Jason"

println "$name1 and $name2"

(name1, name2, name3) = [name2, name1]

println "$name1 and $name2 and $name3"

(firstName1, secondName, thirdName) = [firstName, lastName]

//报错
//(a, b, c) = splitName('A B')

println "$firstName1, $secondName, $thirdName"

//3. 指定多赋值中定义的单个变量的类型
def (String cat, String mouse) = ['Tom', 'Jerry', 'Spike', 'Type']
println "$cat and $mouse"

def (first, second, third) = ['Tom', 'Jerry']
println "$first, $second and $third"