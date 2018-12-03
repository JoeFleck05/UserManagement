
  def group_by_marks(marks, pass_marks)
    # your code here
    marks.each do|t|
      puts"T: #{t}"
    end
    puts "#{marks[pass_marks]}"
  end

