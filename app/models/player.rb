class Player < ApplicationRecord
    belongs_to :team
    # def as_json(options={})
    #     super(
    #         include: team
    #     )
    # end
end
