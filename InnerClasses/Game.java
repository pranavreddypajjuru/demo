// Implementing a Game with a Local Inner Class
class Game
{
	void start()
	{
		class Player
		{
			void play()
			{
				System.out.println("Player is Playing the Game");
			}
		}
		Player p = new Player();
		p.play();
	}
	public static void main(String[] args)
	{
		Game g = new Game();
		g.start();
	}
}