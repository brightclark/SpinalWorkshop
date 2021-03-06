package workshop.stream

import org.scalatest.FunSuite
import spinal.core._
import workshop.common.CocotbRunner

//Run this scala test to generate and check that your RTL work correctly
class StreamUnitTester extends FunSuite{
  test("test") {
    SpinalConfig(targetDirectory = "rtl").dumpWave(0,"../../../../../waves/StreamUnitTester.vcd").generateVerilog(
      StreamUnit()
    )

    assert(CocotbRunner("./src/test/python/workshop/stream"),"Simulation faild")
    println("SUCCESS")
  }
}
