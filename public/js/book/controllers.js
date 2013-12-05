var app = angular.module('guthub',
    ['guthub.directives', 'guthub.services']);


app.controller('ListCtrl',['$scope','recipes',function($scope,recipes){
    $scope.recipes=recipes
}])