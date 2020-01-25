package huffman;

public class Main {

	public static void main(String[] args) {
		HuffmanCompressor huffman = new HuffmanCompressor();
		//huffman.compressFile("input.txt");
		//huffman.deCommpressFile("input.hmc");
		//huffman.compressFolder("test");
		huffman.deCompressFolder("test.hmf");
	}
}
