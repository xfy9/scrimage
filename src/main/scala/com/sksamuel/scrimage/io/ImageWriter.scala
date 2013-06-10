/*
     To apply the Apache License to your work, attach the following
      boilerplate notice, with the fields enclosed by brackets "[]"
      replaced with your own identifying information. (Don't include
      the brackets!)  The text should be enclosed in the appropriate
      comment syntax for the file format. We also recommend that a
      file or class name and description of purpose be included on the
      same "printed page" as the copyright notice for easier
      identification within third-party archives.

   Copyright 2013 Stephen K Samuel

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package com.sksamuel.scrimage.io

import java.io.{OutputStream, File, ByteArrayOutputStream}
import org.apache.commons.io.FileUtils

/** @author Stephen Samuel */
trait ImageWriter {

    def write(out: OutputStream)

    def write(path: String) {
        write(new File(path))
    }
    def write(bytes: Array[Byte]) {
        write(new ByteArrayOutputStream())
    }
    def write(file: File) {
        write(FileUtils.openOutputStream(file))
    }
}