<?php
    include_once '../simple_html_dom.php';
	$namespace = "http://search.yahoo.com/mrss/";
	$xml = new SimpleXMLElement("http://feeds.bbci.co.uk/news/england/rss.xml" , null, TRUE);
	echo "<ul>";
	foreach($xml->channel->item as $item)
	{
		echo '<div class="card">';
		$image = $item->children($namespace)->thumbnail[0]->attributes();
		echo '<img src=" '.$image['url'].'"/>';
		echo "<div id='title'>";
		echo "<h4>$item->title</h4>";
		echo "</div>";
		echo "</div>";
	}
	echo "</ul>";

?>
<style type="text/css">
.card {
	box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
	transition: 0.3s;
	width: 21%;
	float: left;
	margin: 1%;
	padding: 1%
	overflow: hidden;
	height: auto;
	border-radius: 15px;
}

.card:hover {
	box-shadow: 0 8px 16px 0 rgba(0,0,0,0.7);
}
.card:hover #title h4 {
	color: #e8491d;
}	
img {
    max-height: 240px;
    border-radius: 15px 15px 0 0;
    max-width: 100%;
}
</style>
	