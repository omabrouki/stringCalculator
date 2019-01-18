using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace StringCalculatorTest
{
    [TestClass]
    public class StringCalculator
    {
        [TestMethod]
        public void TestMethod1()           
        {
           int stringCalculatorResult = global::StringCalculator.StringCalculator.Add(string.Empty);
            Assert.AreEqual(0, stringCalculatorResult);
        }
    }
}
