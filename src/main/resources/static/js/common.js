/**
 * Method to activate link.
 * 
 * @param referenceElement
 * @returns
 */
function setActiveLink(referenceElement) {
	var listItems = document.getElementById('menuNavigationLeft').getElementsByTagName("li");
	for (var i = 0; i < listItems.length; i++) {
	  listItems[i].classList.remove('active');
	}
	listItems = document.getElementById('menuNavigationRight').getElementsByTagName("li");
	for (var i = 0; i < listItems.length; i++) {
	  listItems[i].classList.remove('active');
	}
	document.getElementById(referenceElement).classList.add('active');
}