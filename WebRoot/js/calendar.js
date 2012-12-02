$(document).ready(function(){
	var $ = function (id) {

	    return "string" == typeof id ? document.getElementById(id) : id;

	};



	var Class = {

	  create: function() {

	    return function() {

	      this.initialize.apply(this, arguments);

	    }

	  }

	}



	var Extend = function(destination, source) {

	    for (var property in source) {

	        destination[property] = source[property];

	    }

	    return destination;

	}





	var Calendar = Class.create();

	Calendar.prototype = {

	  initialize: function(container, options) {

		this.Container = $(container);//����(table�ṹ)

		this.Days = [];//���ڶ����б�

		

		this.SetOptions(options);

		

		this.Year = this.options.Year || new Date().getFullYear();

		this.Month = this.options.Month || new Date().getMonth() + 1;

		this.SelectDay = this.options.SelectDay ? new Date(this.options.SelectDay) : null;

		this.onSelectDay = this.options.onSelectDay;

		this.onToday = this.options.onToday;

		this.onFinish = this.options.onFinish;	

		

		this.Draw();

	  },

	  //����Ĭ������

	  SetOptions: function(options) {

		this.options = {//Ĭ��ֵ

			Year:			0,//��ʾ��

			Month:			0,//��ʾ��

			SelectDay:		null,//ѡ������

			onSelectDay:	function(){},//��ѡ�����ڴ���

			onToday:		function(){},//�ڵ������ڴ���

			onFinish:		function(){}//��������󴥷�

		};

		Extend(this.options, options || {});

	  },

	  //��ǰ��

	  NowMonth: function() {

		this.PreDraw(new Date());

	  },

	  //��һ��

	  PreMonth: function() {

		this.PreDraw(new Date(this.Year, this.Month - 2, 1));

	  },

	  //��һ��

	  NextMonth: function() {

		this.PreDraw(new Date(this.Year, this.Month, 1));

	  },

	  //��һ��

	  PreYear: function() {

		this.PreDraw(new Date(this.Year - 1, this.Month - 1, 1));

	  },

	  //��һ��

	  NextYear: function() {

		this.PreDraw(new Date(this.Year + 1, this.Month - 1, 1));

	  },

	  //�������ڻ�����

	  PreDraw: function(date) {

		//����������

		this.Year = date.getFullYear(); this.Month = date.getMonth() + 1;

		//���»�����

		this.Draw();

	  },

	  //������

	  Draw: function() {

		//�������������б�

		var arr = [];

		//�õ��µ�һ����һ���е�����ֵ��Ϊ�������һ�������

		for(var i = 1, firstDay = new Date(this.Year, this.Month - 1, 1).getDay(); i <= firstDay; i++){ arr.push(0); }

		//�õ������һ����һ�����е�����ֵ��Ϊ���µ�����

		for(var i = 1, monthDay = new Date(this.Year, this.Month, 0).getDate(); i <= monthDay; i++){ arr.push(i); }

		//���ԭ�������ڶ����б�

		this.Days = [];

		//��������

		var frag = document.createDocumentFragment();

		while(arr.length){

			//ÿ�����ڲ���һ��tr

			var row = document.createElement("tr");

			//ÿ��������7��

			for(var i = 1; i <= 7; i++){

				var cell = document.createElement("td"); cell.innerHTML = "&nbsp;";

				if(arr.length){

					var d = arr.shift();

					if(d){

						cell.innerHTML = d;

						this.Days[d] = cell;

						var on = new Date(this.Year, this.Month - 1, d);

						//�ж��Ƿ����

						this.IsSame(on, new Date()) && this.onToday(cell);

						//�ж��Ƿ�ѡ������

						this.SelectDay && this.IsSame(on, this.SelectDay) && this.onSelectDay(cell);

					}

				}

				row.appendChild(cell);

			}

			frag.appendChild(row);

		}

		//����������ٲ���(ie��table������innerHTML)

		while(this.Container.hasChildNodes()){ this.Container.removeChild(this.Container.firstChild); }

		this.Container.appendChild(frag);

		//���ӳ���

		this.onFinish();

	  },

	  //�ж��Ƿ�ͬһ��

	  IsSame: function(d1, d2) {

		return (d1.getFullYear() == d2.getFullYear() && d1.getMonth() == d2.getMonth() && d1.getDate() == d2.getDate());

	  } 

	}

	
	var cale = new Calendar("idCalendar", {

		SelectDay: new Date().setDate(10),

		onSelectDay: function(o){ o.className = "onSelect"; },

		onToday: function(o){ o.className = "onToday"; },

		onFinish: function(){

			$("idCalendarYear").innerHTML = this.Year; $("idCalendarMonth").innerHTML = this.Month;

			var flag = [10,15,20];



		}

		
	});



	$("idCalendarPre").onclick = function(){ cale.PreMonth(); }
	$("idCalendarNext").onclick = function(){ cale.NextMonth(); }

	
	
	
	
});
