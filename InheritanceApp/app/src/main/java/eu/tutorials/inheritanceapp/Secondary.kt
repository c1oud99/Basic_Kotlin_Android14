package eu.tutorials.inheritanceapp

// Derived Class of BaseClass
// Inherits from BaseClass
class Secondary : BaseClass() {

    override fun role(){
        super.role()
        println("Knight of the House of BaseClass")
    }
}