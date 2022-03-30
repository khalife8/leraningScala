object DemoOPartiallyAppliedFunctions {

  def main(args: Array[String]): Unit = {
    Car("Mercedes")
    truck("BMW")
  }

  //def FourWheeler(VehiculeName: String, VehiculeType: String, VehicleCost: Int): Unit ={
    //println("Vehicle name is " + VehiculeName + ", Vehicle type is " + VehiculeType + ", Vehicle cost is " + VehicleCost)
  //}

  val Car = FourWheeler(_:String, "Car", 200000)  // partially implemented function
  val truck = FourWheeler(_:String, "Car", 500000)  // partially implemented function

  val FourWheeler = (VehiculeName: String, VehiculeType: String, VehicleCost: Int) => {
      println("Vehicle name is " + VehiculeName +
        ", Vehicle type is " + VehiculeType +
        ", Vehicle cost is " + VehicleCost)
  }
}
