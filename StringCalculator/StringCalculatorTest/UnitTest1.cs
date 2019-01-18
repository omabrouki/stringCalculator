using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace StringCalculatorTest
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()           
        {
           int stringCalculatorResult = StringCalculator.StringCalculator.Add(string.Empty);
            Assert.AreEqual(0, stringCalculatorResult);
        }
    }
}
