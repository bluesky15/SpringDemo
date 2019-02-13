(function(){
'use strict';
angular
.module('app')
.controller('BookingController', BookingController);

BookingController.$inject =['$http'];

function BookingController($http) {
var vm = this;
vm.bookings =[];
vm.getAll = getAll;
vm.getAffordable = getAffordable;
vm.deleteBooking = deleteBooking;
        init();
     function init(){
           getAll();
    }

    function getAll(){
    var url = "/bookings/all";
                var bookingsPromise = $http.get(url);
                bookingsPromise.then(function(response){
                vm.bookings = response.data;
            });
    }
    function getAffordable(){
        var url ="/bookings/affordable/" + 100
        var bookingsPromise = $http.get(url);
                        bookingsPromise.then(function(response){
                        vm.bookings = response.data;
                        });
    }

    function deleteBooking(id){
    var url = "bookings/delete/" + id;
    $http.delete(url).then(function(response){
    vm.bookings = response.data;
    });
    }
  }
})();