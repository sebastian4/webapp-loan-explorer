'use strict';

angular.module('myApp.view1', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/view1', {
    templateUrl: 'view1/view1.html',
    controller: 'View1Ctrl'
  });
}])

.controller('View1Ctrl', ['$scope','$rootScope','$http','$q', function($scope,$rootScope,$http,$q) {

	console.log("view1 controller again");

	$scope.loans = [];


	$scope.init = function () {
	    console.log("view1 controller INIT");

	    if (undefined===$rootScope.loans) {
	    	$rootScope.loans = [];

	    	$q.all([
			    $http.get('rest/10/1')
				.success($scope.httpSuccess),
				$http.get('rest/10/2')
				.success($scope.httpSuccess),
				$http.get('rest/10/3')
				.success($scope.httpSuccess),
				$http.get('rest/10/4')
				.success($scope.httpSuccess)
			])
			.then($scope.recordLoans)
			.then($scope.setDataTable);

		} else {
			$scope.recordLoans();
			$scope.setDataTable();
		}

	};
	
	////

	$scope.httpSuccess = function(data) {
		$rootScope.loans = $rootScope.loans.concat(data.loanDataList);
	}

	$scope.loansSize = function() {
		return $scope.loans.length;
	}

	$scope.recordLoans = function() {
		$scope.loans = $rootScope.loans;
		$('#load-wheel').hide();
		console.log($scope.loans);
	}

	$scope.setDataTable = function() {
		//nothing
	}

}]);