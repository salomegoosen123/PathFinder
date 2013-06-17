package pathfinding;

public class MyMapLoader {
	private MapFactory mapFactory;
	
	/**
	 * @param nodeFactory
	 * @throws Exception
	 * 
	 * Constructor
	 */
	public MyMapLoader(NodeFactory nodeFactory, AbstractAlgorithm algorithm) throws Exception {
		mapFactory = new MapFactory(nodeFactory, algorithm);		
	}
	
	/**
	 * @param mapFileName
	 * @return
	 * @throws Exception
	 * 
	 * loads and returns the map loaded from the input map file name
	 */
	public MyMap load(String mapFileName) throws Exception {
		return mapFactory.createMap(mapFileName.trim());
	}
	
}