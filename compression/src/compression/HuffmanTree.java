package compression;

public class HuffmanTree {
	Character ch;
	int val;
	HuffmanTree left,right;
	char getChar()
	{
		return ch;
	}
	HuffmanTree()
	{
		this.left=null;
		this.right=null;
	}
}

