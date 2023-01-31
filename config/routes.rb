Rails.application.routes.draw do
  resources :teams
  get 'teams/players/:team_id', to: 'players#players_by_team'
  resources :players
  get 'teams/matches/sample', to: 'teams#sample'
  
  # Define your application routes per the DSL in https://guides.rubyonrails.org/routing.html

  # Defines the root path route ("/")
  # root "articles#index"
end
