$(document).ready(function() {
    $('#fullpage').fullpage({
        //Navigation
        menu: false,
        anchors:['firstSlide', 'secondSlide'],
        navigation: false,
        navigationPosition: 'right',
        navigationTooltips: ['firstSlide', 'secondSlide'],
        showActiveTooltips: false,
        slidesNavigation: false,
//        slidesNavPosition: 'bottom',

        //Scrolling
        css3: true,
        scrollingSpeed: 700,
        autoScrolling: true,
        fitToSection: true,
        scrollBar: false,
        easing: 'easeInOutCubic',
        easingcss3: 'ease',
        loopBottom: false,
        loopTop: false,
        loopHorizontal: true,
        continuousVertical: false,
        normalScrollElements: '#element1, .element2',
        scrollOverflow: false,
        touchSensitivity: 15,
        normalScrollElementTouchThreshold: 5,

        //Accessibility
        keyboardScrolling: true,
//        animateAnchor: true,
//        recordHistory: true,

        //Design
        controlArrows: false,
//        verticalCentered: true,
//        resize : false,
//        sectionsColor : ['#ccc', '#fff'],
//        paddingTop: '3em',
//        paddingBottom: '10px',
//        fixedElements: '#header, .footer',
//        responsive: 0,

        //Custom selectors
//        sectionSelector: '.section',
//        slideSelector: '.slide',

        //events
//        onLeave: function(index, nextIndex, direction){},
//        afterLoad: function(anchorLink, index){},
//        afterRender: function(){},
//        afterResize: function(){},
//        afterSlideLoad: function(anchorLink, index, slideAnchor, slideIndex){},
//        onSlideLeave: function(anchorLink, index, slideIndex, direction){}
    });
});

var currentSlide = $("#fallout");

while(!($('#second').hasClass("active"))){
//while($('body').hasClass("fp-viewing-firstSlide-0")||$('body').hasClass("fp-viewing-firstSlide-1")||$('body').hasClass("fp-viewing-firstSlide-2")||$('body').hasClass("fp-viewing-firstSlide-3")){
//	if($("#catherine").hasClass("active")){
//		break;
//	}
	if(currentSlide.attr("id")=='catherine'){
		setTimeout(function(){ $.fn.fullpage.moveSlideRight();}, 3000);
		setTimeout(function(){ $.fn.fullpage.moveTo('firstSlide', 1);}, 3000);
	}
	else{
		setTimeout(function(){ $.fn.fullpage.moveSlideRight();}, 3000);
		currentSlide = currentSlide.next();
	}
	
}