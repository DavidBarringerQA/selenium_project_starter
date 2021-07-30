(() => {
		const articles =
					[{
							"title": "Our top 5 beers in order of release date",
							"description": "Here it is. The poll quite literally nobody asked for. Join us as we go through our list of top 5 beers based on when they were released.",
							"author": "Jimothy Hayes"
					},
					 {
							 "title": "Bees: We put the \"bee\" in beer",
							 "description": "A spokesperson (spokesbee?) for bees has issued a statement claiming that bees should be entitled to royalties for the hops they pollinate.",
							 "author": "Glennjamin Johnson"
					 },
					 {
							 "title": "Opianoun: beingdrunk no beer hs no impacast on my articl writing",
							 "description": "Reacently, my prick of aboss hasd been gerting on mycase receNtly about howe much I'm dirnking at wprk.but 7 beers a day hs not effected my performmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm",
							 "author": "whos askin"
					 }]
		
		let searchButton = document.querySelector('#search-button');

		let searchBar = document.querySelector("#searchField")

		let searchList = document.querySelector('#search-list');


		let searchResults = () => {
				let searchTerm = searchBar.value.toLowerCase();
				let searchResults = [];
				for (article of articles){
						if(article.title.toLowerCase().includes(searchTerm)){
								let articleElem = document.createElement("div");
								let title = document.createElement("h3");
								title.textContent = article.title;
								let desc = document.createElement("p");
								desc.textContent = article.description;
								let author = document.createElement("p");
								author.textContent = article.author;
								articleElem.appendChild(title);
								articleElem.appendChild(desc);
								articleElem.appendChild(author);
								searchResults.push(articleElem);
						}
				}
				for(elem of searchResults){
						searchList.appendChild(elem);
				}
				console.log(searchResults);

		}

		searchButton.addEventListener('click', searchResults);
})();


