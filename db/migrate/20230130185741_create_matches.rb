class CreateMatches < ActiveRecord::Migration[7.0]
  def change
    create_table :matches do |t|
      t.integer :time_a_id
      t.integer :time_b_id

      t.timestamps
    end
  end
end
