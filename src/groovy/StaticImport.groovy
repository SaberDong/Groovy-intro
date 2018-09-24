package groovy

import static Math.random as rand
import groovy.lang.ExpandoMetaClass as EMC

double value = rand()
println value
def metaClass = new EMC(Integer)
assert metaClass.getClass().name == 'groovy.lang.ExpandoMetaClss' : 'heeh'