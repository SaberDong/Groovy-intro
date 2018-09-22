package groovy

class Car2 {

	final year
	private miles = 0;
	
	Car2 (theYear){ year = theYear }
	
	def  getMiles() {
		println "getMiles called"
		miles
	}
	
	private void setMiles(miles) {
		throw new IllegalAccessException("you're not allowed to change miles");
	}
	
	def drive(dist) {
		if (dist>0)
			miles += dist
	}
	
}

def car2 = new Car2(2018)

println "year: $car2.year"
println "Miles: $car2.miles"
println "Driving"
car2.drive(10)
println "Miles: $car2.miles"

try {
	print 'Can I set the year?'
    car2.year = 2018
}catch(groovy.lang.ReadOnlyPropertyException ex) {
	println ex.message
}

try {
	print 'Can I set the miles?'
	car2.miles = 12
}catch(IllegalAccessException ex) {
	println ex.message
}


