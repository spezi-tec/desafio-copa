class PartidasController < ApplicationController
  before_action :set_partida, only: %i[ show update destroy ]

  # GET /partidas
  def index
    @partidas = Partida.all

    render json: @partidas
  end

  # GET /partidas/1
  def show
    render json: @partida
  end

  # POST /partidas
  def create
    @partida = Partida.new(partida_params)

    if @partida.save
      render json: @partida, status: :created, location: @partida
    else
      render json: @partida.errors, status: :unprocessable_entity
    end
  end

  # PATCH/PUT /partidas/1
  def update
    if @partida.update(partida_params)
      render json: @partida
    else
      render json: @partida.errors, status: :unprocessable_entity
    end
  end

  # DELETE /partidas/1
  def destroy
    @partida.destroy
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_partida
      @partida = Partida.find(params[:id])
    end

    # Only allow a list of trusted parameters through.
    def partida_params
      params.require(:partida).permit(:id, :time1_id, :time2_id, :data_partida, :vencedor)
    end
end
