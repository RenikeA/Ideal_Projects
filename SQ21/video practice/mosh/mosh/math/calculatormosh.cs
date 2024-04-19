using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Channels;
using System.Threading.Tasks;

namespace mosh.Math
{
    public class Calculatormosh // this is a method template //
    {
        public int Add (int a, int b) // access name , return type , method name , method parameter/
        {
            int toptal =a + b;
           
            Console.WriteLine(toptal);
            return toptal;
        } 
    }
}
