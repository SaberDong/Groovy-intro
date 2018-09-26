package groovy

import groovy.transform.Canonical
import groovy.transform.Immutable

/*
 * @Canonical
 */
@Canonical (excludes="lastName, age")
class Person{
	String firstName
	String lastName
	int age
}

def sara = new Person(firstName: "Sara", lastName: "Walker", age: 49)

println sara

println (" ")
println ("***************************************")
println (" ")

/*
 * @Delegate
 */
class Worker {
	def work() { println 'get work done' }
	def analyze() { println 'analyze...' }
	def writeReport() { println 'get report written' }
}

class Expert {
	def analyze() { println "expert analysis..." }
}

class Manager {
	@Delegate Expert expert = new Expert()
	@Delegate Worker worker = new Worker()
}

def bernie = new Manager()
bernie.analyze()
bernie.work()
bernie.writeReport()

println (" ")
println ("***************************************")
println (" ")

/*
 * @Immutable
 */
@Immutable
class CreditCard {
	String cardNumber
	int creditLimit
}

println new CreditCard("4000-1111-2222-3333", 1000)

println (" ")
println ("***************************************")
println (" ")

/*
 * @Lazy
 */
class Heavy {
	def size = 10
	Heavy() { println "Creating Heavy with $size" }
}

class AsNeeded {
	def value = 1
	
	@Lazy Heavy heavy1 = new Heavy()
	@Lazy Heavy heavy2 = new Heavy(size: value)
	@Lazy Heavy heavy3 = { new Heavy(size: value) }()
	
	AsNeeded() { println "Created AsNeeded with $value" }
}

def asNeeded = new AsNeeded(value: 1000)
println asNeeded.heavy1.size
println asNeeded.heavy1.size
println asNeeded.heavy2.size
println asNeeded.heavy3.size

println (" ")
println ("***************************************")
println (" ")

/*
 * @Newify
 */
@Newify([Person, CreditCard])
def fluentCreate() {
	println Person.new(firstName: "John", lastName: "Doe", age: 20)
	println Person(firstName: "John", lastName: "Doe", age: 20)
	println CreditCard("1234-5678-1234-5678", 2000)
}

fluentCreate()

println (" ")
println ("***************************************")
println (" ")


@Singleton(lazy = true)
class TheUnique {
	
	//private TheUnique() { println 'Insatnce created' }
	
	def hello() { println "hello" }
}

println "Accessing TheUnique"
TheUnique.instance.hello()
TheUnique.instance.hello()
