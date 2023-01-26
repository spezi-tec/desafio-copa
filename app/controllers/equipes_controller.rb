class EquipesController < ApplicationController
  before_action :set_equipe, only: %i[ show update destroy ]

  # GET /equipes
  def index
    @equipes = Equipe.all

    render json: @equipes
  end

  # GET /equipes/1
  def show
    render json: @equipe
  end

  # POST /equipes
  def create
    @equipe = Equipe.new(equipe_params)

    if @equipe.save
      render json: @equipe, status: :created, location: @equipe
    else
      render json: @equipe.errors, status: :unprocessable_entity
    end
  end

  # PATCH/PUT /equipes/1
  def update
    if @equipe.update(equipe_params)
      render json: @equipe
    else
      render json: @equipe.errors, status: :unprocessable_entity
    end
  end

  # DELETE /equipes/1
  def destroy
    @equipe.destroy
  end

  # GET /equipes/random
  def random
    count = Equipe.count
    random_offset = rand(count)
    #@random_equipe = Equipe.offset(random_offset).first
    @random_equipe = Equipe.limit(2).order("RANDOM()")

    render json: @random_equipe
  end


  private
    # Use callbacks to share common setup or constraints between actions.
    def set_equipe
      @equipe = Equipe.find(params[:id])
    end

    # Only allow a list of trusted parameters through.
    def equipe_params
      params.require(:equipe).permit(:id, :nome, :total_jogadores, :total_defesa, :total_ataque, :total_meio, :imagem)
    end
end
