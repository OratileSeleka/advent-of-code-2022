package util

import java.io.File

class FileReader {
    companion object {
        fun readFile(packageName: String) : List<String> {
          return File("src\\main\\kotlin\\$packageName\\Input.txt").readLines().apply {
              this.toMutableList().add(" ")
          }
        }
    }
}