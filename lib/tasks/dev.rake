namespace :dev do
  desc "Criar dados para teste das rotas da api"
  task setup: :environment do
    10.times do |i|
      Jogador.create!(
        nome: Faker::Name.name,
        idade:Faker::Internet.email,
        selecao:Faker::Address.country,
      )
    end
  end
end
