using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace mosh
{
    internal class FileClass
    {
        public FileClass() {
            string dummyLines = "this is first line ." + Environment.NewLine +
                            "this is first line ." + Environment.NewLine +
                            "this is first line .";

            File.AppendAllLines(@"c:\DummyFile.txt", dummyLines.Split(Environment.NewLine.ToCharArray()).ToList<string>());
        }
        
                            
    }
   
}
   